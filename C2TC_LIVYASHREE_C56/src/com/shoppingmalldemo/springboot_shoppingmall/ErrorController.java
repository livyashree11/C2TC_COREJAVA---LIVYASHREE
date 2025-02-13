package com.shoppingmalldemo.springboot_shoppingmall;

public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    //@RequestMapping("/error")
    public String handleError() {
        // Provide a custom error message or page
        return "error"; // or any other view name
    }

    //@Override
    public String getErrorPath() {
        return "/error";
    } 
}
