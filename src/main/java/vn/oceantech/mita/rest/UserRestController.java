package vn.oceantech.mita.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.oceantech.mita.dto.UserDto;
import vn.oceantech.mita.service.UserService;

import java.util.Date;

@RestController
@RequestMapping("/users")
public class UserRestController {
    @Autowired
    private UserService userService;

    @GetMapping("/get-user-current")
    public ResponseEntity<UserDto> getUserCurrent() {
        return new ResponseEntity<UserDto>(userService.getCurrentUser(), HttpStatus.OK);
    }
}
