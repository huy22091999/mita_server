package vn.oceantech.mita.service;


import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;
import vn.oceantech.mita.domain.User;
import vn.oceantech.mita.dto.UserDto;

import java.util.UUID;

public interface UserService {
    User findEntityByUsername(String username);

    UserDto findByUsername(String username);

    UserDto findByEmail(String email);

    UserDto save(UserDto user);

    Page<UserDto> findByPage(int pageIndex, int pageSize);

    UserDto getCurrentUser();

    boolean passwordMatch(UserDto dto);

    UserDto changePassword(UserDto dto);

    boolean emailAlreadyUsed(UserDto dto);

    UserDto findByUserId(Long userId);

    UserDto deleteById(Long userId);

    User updateUserLastLogin(Long userId);

    User saveUser(UserDto userDto);

    User getCurrentEntityUser();
}
