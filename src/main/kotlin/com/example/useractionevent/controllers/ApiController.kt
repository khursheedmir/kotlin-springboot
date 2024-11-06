package com.example.useractionevent.controllers

import com.example.useractiontracking.services.UserActionService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController(val userActionService: UserActionService) {

    @GetMapping("/")
    fun index(): String {
        CoroutineScope(Dispatchers.IO).launch {
//            userActionService.processAction()
        }
        return "This is test message"
    }

}