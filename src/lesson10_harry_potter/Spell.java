package lesson10_harry_potter;

public class Spell {

        private String spellWord;
        private int price;
        private int minSpellPower;
        private int maxSpellPower;
        private int successRate;
        private int speedRate;

        public Spell(String spellWord, int price, int minSpellPower, int maxSpellPower, int successRate, int speedRate){
            this.spellWord = spellWord;
            this.price = price;
            this.minSpellPower = minSpellPower;
            this.maxSpellPower = maxSpellPower;
            this.successRate = successRate;
            this.speedRate = speedRate;
        }

        public int getMinSpellPower() {
            return minSpellPower;
        }

        public void setMinSpellPower(int minSpellPower) {
            this.minSpellPower = minSpellPower;
        }

        public int getMaxSpellPower() {
            return maxSpellPower;
        }

        public void setMaxSpellPower(int maxSpellPower) {
            this.maxSpellPower = maxSpellPower;
        }

        public String getSpellWord() {
            return spellWord;
        }

        public void setSpellWord(String spellWord) {
            this.spellWord = spellWord;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSuccessRate() {
            return successRate;
        }

        public void setSuccessRate(int successRate) {
            this.successRate = successRate;
        }

        public int getSpeedRate() {
            return speedRate;
        }

        public void setSpeedRate(int speedRate) {
            this.speedRate = speedRate;
        }
    }



