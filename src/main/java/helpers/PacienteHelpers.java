package helpers;

import model.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteHelpers {
    public List<Paciente>listar();
    public Optional<Paciente>listarRun(String run);
    public int save(Paciente p);
    public void delete(String run);
}
