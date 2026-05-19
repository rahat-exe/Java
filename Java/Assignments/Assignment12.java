package Assignments;
import java.awt.*;


public class Assignment12 extends Frame {

    Label title, nameLbl, addressLbl, contactLbl, emailLbl,
            educationLbl, expertiseLbl, hobbyLbl, dateLbl, signLbl;

    TextField nameTxt, addressTxt, contactTxt, emailTxt, hobbyTxt;

    TextArea educationArea, expertiseArea;

    public Assignment12() {

        setTitle("Biodata Form");
        setSize(700, 700);
        setLayout(null);
        setBackground(Color.white);

        // Title
        title = new Label("Biodata");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(280, 40, 150, 30);
        add(title);

        // Name
        nameLbl = new Label("Name");
        nameLbl.setBounds(120, 100, 100, 30);
        add(nameLbl);

        nameTxt = new TextField();
        nameTxt.setBounds(250, 100, 250, 30);
        add(nameTxt);

        // Address
        addressLbl = new Label("Address");
        addressLbl.setBounds(120, 150, 100, 30);
        add(addressLbl);

        addressTxt = new TextField();
        addressTxt.setBounds(250, 150, 250, 30);
        add(addressTxt);

        // Contact
        contactLbl = new Label("Contact No:");
        contactLbl.setBounds(120, 200, 100, 30);
        add(contactLbl);

        contactTxt = new TextField();
        contactTxt.setBounds(250, 200, 250, 30);
        add(contactTxt);

        // Email
        emailLbl = new Label("Email ID");
        emailLbl.setBounds(120, 250, 100, 30);
        add(emailLbl);

        emailTxt = new TextField();
        emailTxt.setBounds(250, 250, 250, 30);
        add(emailTxt);

        // Education
        educationLbl = new Label("Education Qualification");
        educationLbl.setFont(new Font("Arial", Font.BOLD, 16));
        educationLbl.setBounds(120, 320, 250, 30);
        add(educationLbl);

        educationArea = new TextArea(
                "10:\n\n20:\n\n30:",
                5,
                30,
                TextArea.SCROLLBARS_NONE);
        educationArea.setBounds(120, 360, 400, 120);
        add(educationArea);

        // Expertise
        expertiseLbl = new Label("Expertise Area");
        expertiseLbl.setFont(new Font("Arial", Font.BOLD, 16));
        expertiseLbl.setBounds(120, 500, 200, 30);
        add(expertiseLbl);

        expertiseArea = new TextArea("", 4, 30, TextArea.SCROLLBARS_NONE);
        expertiseArea.setBounds(120, 540, 400, 80);
        add(expertiseArea);

        // Hobby
        hobbyLbl = new Label("Hobby:");
        hobbyLbl.setBounds(120, 640, 80, 30);
        add(hobbyLbl);

        hobbyTxt = new TextField();
        hobbyTxt.setBounds(200, 640, 320, 30);
        add(hobbyTxt);

        // Date
        dateLbl = new Label("Date:");
        dateLbl.setBounds(120, 690, 100, 30);
        add(dateLbl);

        // Signature
        signLbl = new Label("Signature:");
        signLbl.setBounds(450, 690, 100, 30);
        add(signLbl);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Assignment12();
    }
}