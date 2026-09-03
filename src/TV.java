public class TV{

        private int channel;
        private int volumeLevel;
        private boolean on;

        public TV (){
            this.channel = channel;
            this.volumeLevel = 50;
            this.on = on;
        }

        // Metodos
        public void turnOn() {
            on = true;
            System.out.println("¡La TV se ha prendido!");
        }

        public void turnOff() {
            on = false;
            System.out.println("¡La TV se ha apagado!");
        }

        public void setChannel(int newChannel){
            if (on && newChannel <= 100 && newChannel >= 1) {
                channel = newChannel;
                System.out.println("Se ha establecido el canal " + newChannel);
            } else {
                System.out.println("La TV está apagada");
            }
        }

        public void channelUp() {
            if (on && channel <= 100) {
                channel++;
                System.out.println("Se ha avanzado un canal (canal actual: " + channel + ")");
            } else {
                System.out.println("La TV está apagada");
            }
        }

        public void channelDown(){
            if (on && channel >= 1) {
                channel--;
                System.out.println("Se ha avanzado un canal (canal actual: " + channel + ")");
            } else {
                System.out.println("La TV está apagada");
            }
        }

        public void volumeUp() {
            if (on && volumeLevel <= 100) {
                volumeLevel++;
                System.out.println("Se ha subido el volumen (volumen actual: " + volumeLevel + ")");
            } else {
                System.out.println("La TV está apagada");
            }
        }

        public void volumeDown() {
            if (on && volumeLevel >= 1) {
                volumeLevel--;
                System.out.println("Se ha bajado el volumen (volumen actual: " + volumeLevel + ")");
            } else {
                System.out.println("La TV está apagada");
            }
        }
}
