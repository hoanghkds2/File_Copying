package repository;

import data_access.DataCopyDAO;
import model.FileData;

public class DataCopyRepository implements IDataCopyRepository {

    @Override
    public void dataCopy(FileData data) {
        DataCopyDAO.Instance().dataCopy(data);
    }
}
