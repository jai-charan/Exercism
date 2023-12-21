class ResistorColor {
    int colorCode(String color) {
        String[] colours = colors();
        for (int value=0;value<10;value++){
            if(colours[value] == color){
                return value;
            }
        }
        return -1;
        }
    

    String[] colors() {
        String[] color = new String[10];
        color[0]="black";
        color[1]="brown";
        color[2]="red";
        color[3]="orange";
        color[4]="yellow";
        color[5]="green";
        color[6]="blue";
        color[7]="violet";
        color[8]="grey";
        color[9]="white";
        return color;
    }
}
