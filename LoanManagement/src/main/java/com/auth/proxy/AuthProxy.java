
package com.auth.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.auth.model.AuthResponse;

@FeignClient(name = "${feign.auth.name}", url = "${feign.auth.url}")
public interface AuthProxy {

    @GetMapping("/validate")
    public AuthResponse getValidity(@RequestHeader(name = "Authorization", required = true) String token);

}
