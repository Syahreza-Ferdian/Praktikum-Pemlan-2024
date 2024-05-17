package GUI;

import java.awt.*;
import java.awt.event.*;


public class TFrame extends Frame {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    Button btnHasil;

    public TFrame() {
        setLayout(null);

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 18));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 170, 20);

        lbTugas = new Label("Tugas");
        add(lbTugas);
        lbTugas.setBounds(100, 60, 62, 20);

        lbKuis = new Label("Kuis");
        add(lbKuis);
        lbKuis.setBounds(100, 90, 62, 20);

        lbUTS = new Label("UTS");
        add(lbUTS);
        lbUTS.setBounds(100, 120, 62, 20);

        lbUAS = new Label("UAS");
        add(lbUAS);
        lbUAS.setBounds(100, 150, 62, 20);

        lbHasil = new Label("Hasil");
        add(lbHasil);
        lbHasil.setBounds(100, 180, 62, 20);

        txtTugas = new TextField("0");
        add(txtTugas);
        txtTugas.setBounds(200, 60, 100, 20);

        txtKuis = new TextField("0");
        add(txtKuis);
        txtKuis.setBounds(200, 90, 100, 20);

        txtUTS = new TextField("0");
        add(txtUTS);
        txtUTS.setBounds(200, 120, 100, 20);

        txtUAS = new TextField("0");
        add(txtUAS);
        txtUAS.setBounds(200, 150, 100, 20);

        txtHasil = new TextField("0");
        add(txtHasil);
        txtHasil.setBounds(200, 180, 100, 20);

        btnHasil = new Button("Hitung");
        add(btnHasil);
        btnHasil.setBounds(150, 210, 100, 20);
        btnHasil.addActionListener(new MainAction());
    }

    class MainAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int tugas = Integer.parseInt(txtTugas.getText().trim());
            int kuis = Integer.parseInt(txtKuis.getText().trim());
            int uts = Integer.parseInt(txtUTS.getText().trim());
            int uas = Integer.parseInt(txtUAS.getText().trim());

            String hasil = String.valueOf(tugas/4 + kuis/4 + uts/4 + uas/4);
            txtHasil.setText(hasil);
        }
    }
}

class MainFrame {
    public static void main(String[] args) {
        TFrame frame = new TFrame();
        frame.setTitle("Hitung Nilai Akhir");
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

