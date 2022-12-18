package gradecalc;

public enum letterGrade {
    Aplus {
        @Override
        public String toString() {
            return ("A+ :D");
        }
    },
    A {
        @Override
        public String toString() {
            return ("A:)");
        }
    },
    Aminus {
        @Override
        public String toString() {
            return ("A-");
        }
    },
    Bplus {
        @Override
        public String toString() {
            return ("B+");
        }
    },
    B {
        @Override
        public String toString() {
            return ("B");
        }
    },
    Bminus {
        @Override
        public String toString() {
            return ("B-");
        }
    },
    Cplus {
        @Override
        public String toString() {
            return ("C+");
        }
    },
    C {
        @Override
        public String toString() {
            return ("C");
        }
    },
    Cminus {
        @Override
        public String toString() {
            return ("C-");
        }
    },
    Dplus {
        @Override
        public String toString() {
            return ("D+");
        }
    },
    D {
        @Override
        public String toString() {
            return ("D");
        }
    },
    Dminus {
        @Override
        public String toString() {
            return ("D-");
        }
    },
    F {
        @Override
        public String toString() {
            return ("F:(");
        }
    }
}
