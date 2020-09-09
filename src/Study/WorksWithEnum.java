package Study;

public class WorksWithEnum {
    public enum Members {
        JERRY("solo-guitar") {
            @Override
            public String sings() {
                return "sad";
            }
        },
        BOBBY("ritm-guitar") {
            @Override
            public String sings() {
                return "hard";
            }
        },
        PHIL("bas-guitar");
        private String insrument;

        Members(String instrument) {
            this.insrument = instrument;
        }

        public String getInsrument() {
            return this.insrument;
        }

        public String sings() {
            return "Редко";
        }
    }

    public static Members select;

    public static void main(String[] args) {
        for (Members m :
                Members.values()) {
            System.out.print(m);
            System.out.print(", инструмент: "+m.getInsrument());
            System.out.println(", звучит: "+m.sings());
        }
        //Вывод : JERRY, инструмент: solo-guitar, звучит: sad
        //        BOBBY, инструмент: ritm-guitar, звучит: hard
        //        PHIL, инструмент: bas-guitar, звучит: Редко

    }
}
