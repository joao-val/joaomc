package com.joaoval.joaomc.domain.enums;

public enum ClientType {

    PERSON(1, "Person"),
    COMPANY(2, "Company");

    private int cod;
    private String description;

    private ClientType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static ClientType toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (ClientType x : ClientType.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Invalid id: " + cod);
    }
}
