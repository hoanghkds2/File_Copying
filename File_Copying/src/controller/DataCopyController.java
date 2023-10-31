package controller;

import model.FileData;
import repository.DataCopyRepository;

public class DataCopyController {

    protected DataCopyRepository repo;
    protected FileData data;

    public DataCopyController() {
        repo = new DataCopyRepository();
        data = new FileData();
    }

    public void run() {
        repo.dataCopy(data);
    }
}
