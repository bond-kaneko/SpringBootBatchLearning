package com.springboots.springbatchlearn.springbatchlearn.validator;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.util.StringUtils;

public class RequiredValidator implements JobParametersValidator {
    @Override
    public void validate(JobParameters parameters) throws JobParametersInvalidException {
        String key = "require1";
        String require1 = parameters.getString(key);

        if (StringUtils.isEmpty(require1)) {
            String errorMsg = "Not enterd: " + key;
            throw new JobParametersInvalidException(errorMsg);
        }
    }
}
