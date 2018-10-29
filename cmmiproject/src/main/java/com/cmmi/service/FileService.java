package com.cmmi.service;


import com.cmmi.model.File;

import java.util.List;

public interface FileService {

    public void saveFile(File file);

    public List<File> findByUploadId(Integer uploadId);

    public List<File> findByFileType(Integer fileType);

}
