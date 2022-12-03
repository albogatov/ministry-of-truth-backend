package itmo.abogatov.ministryoftruthbackend.controllers;

import itmo.abogatov.ministryoftruthbackend.model.ResponseMessageEntity;
import itmo.abogatov.ministryoftruthbackend.security.jwt.JwtUtil;
import itmo.abogatov.ministryoftruthbackend.service.impl.EmployeeProfileServiceImpl;
import itmo.abogatov.ministryoftruthbackend.service.impl.EmployeeServiceImpl;
import itmo.abogatov.ministryoftruthbackend.transfer.EmployeeDto;
import itmo.abogatov.ministryoftruthbackend.transfer.EmployeeProfileDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.NonUniqueResultException;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/auth/")
public class EmployeeProfileController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeProfileController.class);

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private EmployeeProfileServiceImpl employeeProfileService;

    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody EmployeeProfileDto user){
        if (user.getLogin() == null || user.getPassword() == null) {
            logger.error("Absent login or password");
            return new ResponseEntity<>(new ResponseMessageEntity("Absent login or password"), HttpStatus.BAD_REQUEST);
        }
        try {
            String login = user.getLogin();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login, user.getPassword()));
            String token = jwtUtil.resolveToken(login);
            System.out.println(token);
            return new ResponseEntity<>(new ResponseMessageEntity(token), HttpStatus.OK);
        } catch (AuthenticationException e) {
            return new ResponseEntity<>(new ResponseMessageEntity("Wrong login or password"), HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/startRegister")
    public ResponseEntity register(@RequestBody EmployeeDto user){
        logger.debug("registering user");
        try {
            logger.debug(user.toString());
            if (user.getName() == null || user.getAge() == null || user.getName().trim().equals("")) {
                logger.error("Absent name or age");
                throw new IllegalArgumentException();
            }



//            if (employeeProfileService.find(user.getLogin()) != null) {
//                logger.error("Already registered" + employeeProfileService.find(user.getLogin()));
//                return new ResponseEntity<>(new ResponseMessageEntity("User already registered"), HttpStatus.CONFLICT);
//            }
//            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            employeeService.save(employeeService.prepareEntity(user));

            return new ResponseEntity<>(new ResponseMessageEntity("User successfully registered", 1, ""), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            logger.error("Invalid register");
            return new ResponseEntity<>(new ResponseMessageEntity("Invalid login or password", 1, ""), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody EmployeeProfileDto user){
        logger.debug("registering user");
        try {
            logger.debug(user.toString());
            if (user.getLogin() == null || user.getPassword() == null || user.getLogin().trim().equals("")
                    || user.getPassword().trim().equals("")) {
                logger.error("Absent login or password");
                throw new IllegalArgumentException();
            }

            if (employeeProfileService.find(user.getLogin()) != null) {
                logger.error("Already registered" + employeeProfileService.find(user.getLogin()));
                return new ResponseEntity<>(new ResponseMessageEntity("User already registered"), HttpStatus.CONFLICT);
            }
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            employeeProfileService.save(employeeProfileService.prepareEntity(user));

            return new ResponseEntity<>(new ResponseMessageEntity("User successfully registered"), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            logger.error("Invalid register");
            return new ResponseEntity<>(new ResponseMessageEntity("Invalid login or password"), HttpStatus.BAD_REQUEST);
        }
    }
}
