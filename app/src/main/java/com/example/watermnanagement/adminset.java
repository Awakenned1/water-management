package com.example.watermnanagement;

import android.content.Context;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class adminset {
    public void createAdminAccount(Context context) {
        FirebaseAuth auth = FirebaseAuth.getInstance();
        auth.createUserWithEmailAndPassword("admin@gmail.com", "adminwater")
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser user = auth.getCurrentUser();
                        if (user != null) {
                            FirebaseFirestore db = FirebaseFirestore.getInstance();
                            Map<String, Object> userRole = new HashMap<>();
                            userRole.put("role", "admin");

                            db.collection("users").document(user.getUid())
                                    .set(userRole)
                                    .addOnSuccessListener(aVoid -> Log.d("Firestore", "Admin account created successfully"))
                                    .addOnFailureListener(e -> Log.w("Firestore", "Error creating admin account", e));
                        }
                    } else {
                        Log.e("FirebaseAuth", "createUserWithEmail:failure", task.getException());
                    }
                });
    }

}
