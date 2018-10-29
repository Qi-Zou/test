package com.cmmi.service.impl;

import com.cmmi.mapper.FileMapper;
import com.cmmi.model.File;
import com.cmmi.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FileServiceImpl implements FileService {


    @Autowired
    private FileMapper fileMapper;

    @Override
    public void saveFile(File file) {
        fileMapper.insert(file);
    }

//    通过上传人的ID，查找该人上传的所有文件
    @Override
    public List<File> findByUploadId(Integer uploadId) {
        return fileMapper.findByUploadId(uploadId);
    }

    @Override
    public List<File> findByFileType(Integer fileType) {
        return fileMapper.findByFileType(fileType);
    }

    //通过文件类型查找所有文件

}
