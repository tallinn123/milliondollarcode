package codebank.method.getters_and_setters;

public class GetAndSetDog {
        private String name;
        private int age;
        private String species;

        public GetAndSetDog(String name,int age, String species) {
            this.name = name;
            this.age = age;
            this.species = species;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        void print(){
            System.out.println("Dog name:"+name+" Age:"+age+" Species:"+species);
        }

        void ageDecision(){
            if( species.equalsIgnoreCase("Chihuahua") || species.equalsIgnoreCase("Beagle")){
                if(age<3){
                    System.out.println("Dog is young");
                }else if( age<=6){
                    System.out.println("Dog is adult");
                }else{
                    System.out.println("Dog is old");
                }
            }else if( species.equalsIgnoreCase("Husky") ){
                if(age<4){
                    System.out.println("Dog is young");
                }else if(age<=7){
                    System.out.println("Dog is adult");
                }else{
                    System.out.println("Dog is old");
                }
            }else{
                System.out.println("This dog does not have a species");
            }
        }
    }