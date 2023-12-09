package Flight;

public class Flight {
        private int num;
        private String des;

        public Flight(){
            this.num = 0;
            this.des = "";
        }

        public Flight(int num, String des){
            if(num > 0) {
                this.num = num;
            } else {
                this.num = 0;
                this.des = "";
                return;
            }
            this.des = des;
        }

    public int getNum() {
        return num;
    }
    public String getDes() {
        return des;
    }

    public void display() {
        System.out.println(num + ", " + des);
    }


}
