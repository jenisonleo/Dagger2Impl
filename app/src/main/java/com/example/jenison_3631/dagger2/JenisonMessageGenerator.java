package com.example.jenison_3631.dagger2;

/**
 * Created by jenison-3631 on 22/08/17.
 */

public class JenisonMessageGenerator implements JenisonMessageProvider {
    @Override
    public String generateMyMessage() {
        return "jenison";
    }
}
