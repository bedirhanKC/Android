package com.bedirhankc.l2_classesandfunctions

class Person(var name: String, var age: Int,var gender: String){
   private var job: String? = null

    fun setJob(job: String) {
        if(job == "Developer" || job == "Teacher" || job == "Student") {
            this.job = job
        } else {
            println("Invalid Job")
        }
    }
}

/*
class Person {
    var name: String? = null
    var age: Int? = null
    var gender: String? = null

    constructor( name: String, age: Int, gender: String) {
        this.name = name
        this.age = age
        this.gender = gender
    }
}
*/