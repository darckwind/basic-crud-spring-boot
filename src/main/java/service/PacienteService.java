package service;

import helpers.PacienteHelpers;
import model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import repository.PacienteRepository;

import java.util.List;
import java.util.Optional;

public class PacienteService implements PacienteHelpers {
    @Autowired
    private PacienteRepository data;

    @Override
    public List<Paciente> listar() {
        return (List<Paciente>) data.findAll();
    }

    @Override
    public Optional<Paciente> listarRun(String run) {
        return data.findById(run);
    }

    @Override
    public int save(Paciente p) {
        int res = 0;
        Paciente paciente = data.save(p);
        if (!paciente.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(String run) {
        data.deleteById(run);
    }
}
