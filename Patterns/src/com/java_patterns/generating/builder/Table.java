package com.java_patterns.generating.builder;

public class Table {
    private String name;
    private int legsNumber;
    private String color;
    private String material;
    private boolean modify;

    public Table(Builder builder) {
        this.name=builder.name;
        this.legsNumber=builder.legsNumber;
        this.color=builder.color;
        this.material=builder.material;
        this.modify=builder.modify;
    }
    public String toString() {
        return "name = " + name + " legsNumber = " + legsNumber
                + " color = " + color + " material = " + material +
                " modify = " + modify;
    }
    public static class Builder {
        //required parameters
        private String name;
        private int legsNumber;
        //optional parameters
        private String material="wood";
        private boolean modify=false;
        private String color="white";

        public Builder(String name, int legsNumber) {
            this.name=name;
            this.legsNumber=legsNumber;
        }

        public Builder withMaterial(String material) {
            this.material=material;
            return this;
        }

        public Builder withModify(boolean modify) {
            this.modify=modify;
            return this;
        }

        public Builder withColor(String color) {
            this.color=color;
            return this;
        }

        public Table build() {
            return new Table(this);
        }


    }
}
