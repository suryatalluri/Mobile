/*Copyright (c) 2017-2018 offline.com All Rights Reserved.
 This software is the confidential and proprietary information of offline.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with offline.com*/

package com.mobile.test_blob.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

@Service
public class Test_blobProcedureExecutorServiceImpl implements Test_blobProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test_blobProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("test_blobWMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;


}


