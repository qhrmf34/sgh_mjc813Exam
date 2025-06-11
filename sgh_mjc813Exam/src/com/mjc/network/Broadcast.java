package com.mjc.network;

public interface Broadcast {
    public void broadcastMessage(String message);
    public void closeAllConnections();

    }
