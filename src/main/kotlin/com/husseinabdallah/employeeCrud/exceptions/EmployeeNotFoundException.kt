package com.husseinabdallah.employeeCrud.exceptions

import org.springframework.http.HttpStatus

class EmployeeNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception() {
}