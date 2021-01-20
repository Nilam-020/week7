package com.sakriya.week7

import com.sakriya.week7.model.Student
import com.sakriya.week7.model.User

var userModel: ArrayList<User> = arrayListOf(
    User(
        "Sakriya Khadka",
        "admin",
        "pass123"
    )
)
var lstStudent: ArrayList<Student> = arrayListOf(
    Student(
        "Sakriya Khadka",
        21,
        "Kathmandu",
        "Male"
    )
)

fun getLogin(username: String, password: String): User {
    var data = User("", "", "")
    for (i in userModel) {
        if (i.userName == username && i.password == password) {
            data = i
            break
        }
    }
    return data

}