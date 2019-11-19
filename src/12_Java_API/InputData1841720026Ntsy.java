package percobaan4;

import java.util.ArrayList;
public class InputData1841720026Ntsy {
    ArrayList<Mahasiswa1841720026Ntsy> ListMahasiswa;

    public InputData1841720026Ntsy() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiData(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720026Ntsy mhs = new Mahasiswa1841720026Ntsy(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720026Ntsy> getData() {
        return ListMahasiswa;
    }
}
