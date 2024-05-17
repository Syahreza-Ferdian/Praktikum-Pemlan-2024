package GUI.TP1.GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import GUI.TP1.Model.ASD;
import GUI.TP1.Model.Matkom;
import GUI.TP1.Model.Matkul;
import GUI.TP1.Model.Pemlan;
import GUI.TP1.Model.Probstat;

public class Layout extends Frame {
    Label lbJudul, lbTugas, lbKuis, lbUTS, lbUAS, lbHasil;
    TextField txtTugas, txtKuis, txtUTS, txtUAS, txtHasil;
    Button btnHasil, btnShowAllNilai;
    TextArea nilaiAllMatkul;
    CheckboxGroup cbGroup;
    Checkbox cbAsd, cbPemlan, cbMatkom, cbProbstat;

    ArrayList<Matkul> matkuls = new ArrayList<Matkul>(){
        @Override
        public boolean add(Matkul e) {
            if (size() == 0) {
                return super.add(e);
            } else {
                for (int i = 0; i < size(); i++) {
                    if (get(i).getClass().equals(e.getClass())) {
                        set(i, e);
                        return true;
                    }
                }
                return super.add(e);
            }
        };
    };

    String currentSelection;

    public Layout() {
        setLayout(null);
        addWindowListener(new WindowListener());

        lbJudul = new Label("Hitung Nilai Akhir");
        lbJudul.setFont(new Font("Arial", 1, 18));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 170, 20);

        cbGroup = new CheckboxGroup();

        cbAsd = new Checkbox("ASD", cbGroup, false);
        add(cbAsd);
        cbAsd.setBounds(40, 60, 50, 20);
        cbAsd.addItemListener(new OnCBSelected());

        cbPemlan = new Checkbox("Pemlan", cbGroup, false);
        add(cbPemlan);
        cbPemlan.setBounds(100, 60, 70, 20);
        cbPemlan.addItemListener(new OnCBSelected());

        cbMatkom = new Checkbox("Matkom", cbGroup, false);
        add(cbMatkom);
        cbMatkom.setBounds(180, 60, 70, 20);
        cbMatkom.addItemListener(new OnCBSelected());

        cbProbstat = new Checkbox("Probstat", cbGroup, false);
        add(cbProbstat);
        cbProbstat.setBounds(260, 60, 70, 20);
        cbProbstat.addItemListener(new OnCBSelected());

        lbTugas = new Label("Tugas");
        add(lbTugas);
        lbTugas.setBounds(100, 90, 62, 20);

        lbKuis = new Label("Kuis");
        add(lbKuis);
        lbKuis.setBounds(100, 120, 62, 20);

        lbUTS = new Label("UTS");
        add(lbUTS);
        lbUTS.setBounds(100, 150, 62, 20);

        lbUAS = new Label("UAS");
        add(lbUAS);
        lbUAS.setBounds(100, 180, 62, 20);

        lbHasil = new Label("Hasil");
        add(lbHasil);
        lbHasil.setBounds(100, 210, 62, 20);

        txtTugas = new TextField();
        add(txtTugas);
        txtTugas.setBounds(200, 90, 100, 20);

        txtKuis = new TextField();
        add(txtKuis);
        txtKuis.setBounds(200, 120, 100, 20);

        txtUTS = new TextField();
        add(txtUTS);
        txtUTS.setBounds(200, 150, 100, 20);

        txtUAS = new TextField();
        add(txtUAS);
        txtUAS.setBounds(200, 180, 100, 20);

        txtHasil = new TextField();
        add(txtHasil);
        txtHasil.setBounds(200, 210, 150, 20);
        txtHasil.setEditable(false);
        txtHasil.setFocusable(false);

        btnHasil = new Button("Hitung");
        add(btnHasil);
        btnHasil.setBounds(150, 240, 100, 20);
        btnHasil.addActionListener(new OnHitungBtnClicked());

        nilaiAllMatkul = new TextArea();
        add(nilaiAllMatkul);
        nilaiAllMatkul.setBounds(50, 270, 300, 200);

        btnShowAllNilai = new Button("Tampilkan nilai semua matkul");
        add(btnShowAllNilai);
        btnShowAllNilai.setBounds(100, 480, 200, 20);
        btnShowAllNilai.addActionListener(new OnShowAllNilaiBtnClicked());
    }

    class WindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(0);
        }        
    }

    class OnCBSelected implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (cbAsd.getState()) {
                currentSelection = "asd";
            } else if (cbPemlan.getState()) {
                currentSelection = "pemlan";
            } else if (cbMatkom.getState()) {
                currentSelection = "matkom";
            } else if (cbProbstat.getState()) {
                currentSelection = "probstat";
            }
        }
    }

    class OnHitungBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int tugasInput, kuisInput, utsInput, uasInput;
            
            try {
                tugasInput = Integer.parseInt(txtTugas.getText().trim());
                kuisInput = Integer.parseInt(txtKuis.getText().trim());
                utsInput = Integer.parseInt(txtUTS.getText().trim());
                uasInput = Integer.parseInt(txtUAS.getText().trim());
            } catch (NumberFormatException ex) {
                txtHasil.setText("Input harus berupa angka");
                return;
            }

            if (currentSelection == null) {
                txtHasil.setText("Pilih mata kuliah terlebih dahulu");
            } else if (currentSelection.equals("asd")) {
                ASD asd = new ASD(tugasInput, kuisInput, utsInput, uasInput);
                matkuls.add(asd);
                txtHasil.setText(String.valueOf(asd.getNilaiAkhir()));
            } else if (currentSelection.equals("pemlan")) {
                Pemlan pemlan = new Pemlan(tugasInput, kuisInput, utsInput, uasInput);
                matkuls.add(pemlan);
                txtHasil.setText(String.valueOf(pemlan.getNilaiAkhir()));
            } else if (currentSelection.equals("matkom")) {
                Matkom matkom = new Matkom(tugasInput, kuisInput, utsInput, uasInput);
                matkuls.add(matkom);
                txtHasil.setText(String.valueOf(matkom.getNilaiAkhir()));
            } else if (currentSelection.equals("probstat")) {
                Probstat probstat = new Probstat(tugasInput, kuisInput, utsInput, uasInput);
                matkuls.add(probstat);
                txtHasil.setText(String.valueOf(probstat.getNilaiAkhir()));
            }
        }
    }

    class OnShowAllNilaiBtnClicked implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String header = "HASIL NILAI SEMUA MATA KULIAH";
            String result = "";

            for (Matkul matkul : matkuls) {
                if (matkul instanceof ASD) {
                    ASD asd = (ASD) matkul;
                    result += "ASD\t\t: " + asd.getNilaiAkhir() + "\n";
                } else if (matkul instanceof Pemlan) {
                    Pemlan pemlan = (Pemlan) matkul;
                    result += "Pemlan\t\t: " + pemlan.getNilaiAkhir() + "\n";
                } else if (matkul instanceof Matkom) {
                    Matkom matkom = (Matkom) matkul;
                    result += "Matkom\t\t: " + matkom.getNilaiAkhir() + "\n";
                } else if (matkul instanceof Probstat) {
                    Probstat probstat = (Probstat) matkul;
                    result += "Probstat\t\t: " + probstat.getNilaiAkhir() + "\n";
                }
            }

            nilaiAllMatkul.setText(String.format("%s\n\n%s", header, result));
        }
    }
}
