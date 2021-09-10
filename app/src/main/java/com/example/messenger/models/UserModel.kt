package com.example.messenger.models

data class UserModel(
    val id: String = "",
    var username: String = "",
    var bio: String = "",
    var fullname: String = "",
    var state: String = "",
    var phone: String = "",
    var photoUrl: String = "https://firebasestorage.googleapis.com/v0/b/messenger-d3c3e.appspot.com" +
            "/o/default_photo.png?alt=media&token=94543e59-d864-4f9a-a9be-c430991e4808"
)