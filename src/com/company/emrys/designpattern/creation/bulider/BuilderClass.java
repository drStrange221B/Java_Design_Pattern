package com.company.emrys.designpattern.creation.bulider;

public class BuilderClass {



    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public BuilderClass build() {
            return new BuilderClass(this);
        }


    }
        private final String bread;
        private final String condiments;
        private final String dressing;
        private final String meat;


    private BuilderClass(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
            return bread;
        }

        public String getCondiments() {
            return condiments;
        }

        public String getDressing() {
            return dressing;
        }

        public String getMeat() {
            return meat;
        }

        @Override
        public String toString() {
            return "BuilderClass{" +
                    "bread='" + bread + '\'' +
                    ", condiments='" + condiments + '\'' +
                    ", dressing='" + dressing + '\'' +
                    ", meat='" + meat + '\'' +
                    '}';
        }


}
