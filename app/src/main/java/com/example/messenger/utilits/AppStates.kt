package com.example.messenger.utilits

import com.example.messenger.database.*

enum class AppStates(val state:String) {

    ONLINE("online"),
    OFFLINE("was recently"),
    TYPING("Prints");

    companion object{
        fun updateState(appStates: AppStates){
            if (AUTH.currentUser!=null){
                REF_DATABASE_ROOT.child(
                    NODE_USERS
                ).child(CURRENT_UID).child(
                    CHILD_STATE
                )
                    .setValue(appStates.state)
                    .addOnSuccessListener { USER.state = appStates.state }
                    .addOnFailureListener { showToast(it.message.toString()) }
            }
        }
    }
}