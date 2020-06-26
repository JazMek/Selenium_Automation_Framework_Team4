package databases;

public class UnitedList {

        String from;
        String to;
        String month;
        String Adults;
        String Seniors;
        String Children1;
        String Children2;


        public UnitedList(String from, String to, String month, String Adults, String Seniors, String Children1,String Children2){
            this.from = from;
            this.to = to;
            this.month= month;
            this.Adults= Adults;
            this.Seniors= Seniors;
            this.Children1= Children1;
            this.Children2= Children2;


        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public String getMonth() {
            return month;
        }

        public String getAdults() {
            return Adults;
        }

        public String getSeniors() {
            return Seniors;
        }

        public String getChildren1() {
            return Children1;
        }

        public String getChildren2() {
            return Children2;
        }




    }



