package com.ecomerce.library.service;

import com.ecomerce.library.dto.AdminDto;
import com.ecomerce.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);
    Admin save(AdminDto adminDto);
}
