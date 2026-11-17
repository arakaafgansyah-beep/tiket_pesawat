                                                                                                       import javax.swing.*;
import java.awt.*;

// Tugas 1: pendaftaran seminar (radio kategori + checkbox sesi + validasi + konfirmasi)
public class Tugas1_Seminar extends JFrame {
    public Tugas1_Seminar() {
        super("Pendaftaran Seminar");
        JTextField nama = new JTextField(14);
        JRadioButton mhs = new JRadioButton("Mahasiswa 40000", true), umum = new JRadioButton("Umum 110000");
        ButtonGroup g = new ButtonGroup(); g.add(mhs); g.add(umum);
        JCheckBox ws = new JCheckBox("Workshop +40000"), makan = new JCheckBox("Makan siang +30000"), sert = new JCheckBox("Sertifikat +15000");
        JButton btn = new JButton("Daftar");
        JLabel hasil = new JLabel("Belum mendaftar");
        btn.addActionListener(e -> {
            if (nama.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama wajib diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int total = mhs.isSelected() ? 40000 : 110000;
            if (ws.isSelected()) { total += 40000; }
            if (makan.isSelected()) { total += 30000; }
            if (sert.isSelected()) { total += 15000; }
            int j = JOptionPane.showConfirmDialog(this, "Total Rp " + total + ". Daftar sekarang?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            hasil.setText(j == JOptionPane.YES_OPTION ? nama.getText().trim() + " terdaftar, Rp " + total : "Pendaftaran dibatalkan");
        });
        setLayout(new GridLayout(0, 1, 3, 3));
        add(new JLabel("Nama:")); add(nama); add(mhs); add(umum); add(ws); add(makan); add(sert); add(btn); add(hasil);
        pack(); setLocationRelativeTo(null); setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) { SwingUtilities.invokeLater(() -> new Tugas1_Seminar().setVisible(true)); }
}