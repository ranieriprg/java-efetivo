package ITEM02;
public class Pizza {
    private final int size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;

    public int getSize() {
        return this.size;
    }

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
    }

    public static class Builder {
        private final int size; // obrigatório
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;

        public Builder(int size) {
            this.size = size;
        }

        public Builder cheese(boolean val) {
            cheese = val;
            return this;
        }

        public Builder pepperoni(boolean val) {
            pepperoni = val;
            return this;
        }

        public Builder bacon(boolean val) {
            bacon = val;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }
}
