package org.example;

public class ValidIPAddress {

    public String validIPAddress(String queryIP) {

        if (queryIP == null || queryIP.isEmpty()) {
            return "Neither";
        }

        if (containDot(queryIP)) {

            String[] part = queryIP.split("\\.");
            if (part.length != 4) {
                return "Neither";
            }

        } else if (containEye(queryIP)) {

        } else {
            return "Neither";
        }

    }

    private boolean containDot(String ip) {
        return ip.contains(".");
    }

    private boolean containEye(String ip) {
        return ip.contains(":");
    }

}
