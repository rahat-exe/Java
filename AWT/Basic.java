import java.awt.*;
// import java.awt.event.*;

public class Basic {
    
    public static void main(String args[]) {
        

        Frame f = new Frame("Basic AWT Frame");
        f.setSize(400, 300);
        // f.setLayout(new FlowLayout());
        f.setLayout(new GridLayout(8, 1));

        Label l = new Label("Enter Name?");
        TextField t = new TextField(20);
        Button btn = new Button("Submit");
        Label l1 = new Label(null);

        btn.addActionListener(e -> {
            l1.setText("Hello " + t.getText());
        });
        
        f.add(l);
        f.add(t);
        f.add(btn);
        f.add(l1);



        f.setBackground(Color.LIGHT_GRAY);
        
        f.setVisible(true);

    }
}






















// class InfoForm{
//     InfoForm(){
//         Frame f = new Frame("Basic AWT Frame");
//         f.setSize(400, 300);
//         f.setLayout(new FlowLayout());

//         Label l = new Label("Enter Name?");
//         TextField t = new TextField(20);
//         Button btn = new Button("Submit");

//         f.add(l);
//         f.add(t);
//         f.add(btn);

//         f.setVisible(true);
//     }
// }

// public class Basic {
//     public static void name(){
//         Frame f = new Frame("Basic AWT Frame");
//         f.setSize(400, 300);
//         f.setLayout(new FlowLayout());

//         Label l = new Label("Enter Name?");
//         TextField t = new TextField(20);
//         Button btn = new Button("Submit");

//         f.add(l);
//         f.add(t);
//         f.add(btn);

//         f.setVisible(true);
//     }
//     public static void main(String args[]){
//         InfoForm f = new InfoForm();
//         name();

//     }
// }
