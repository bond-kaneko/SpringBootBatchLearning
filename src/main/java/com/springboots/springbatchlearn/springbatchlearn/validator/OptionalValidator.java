package com.springboots.springbatchlearn.springbatchlearn.validator;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.util.StringUtils;

public class OptionalValidator implements JobParametersValidator {
    @Override
    public void validate(JobParameters parameters) throws JobParametersInvalidException {
        String key = "option1";
        String option1 = parameters.getString(key);

        if(StringUtils.isEmpty(option1)) {
            return;
        }

        try {
            Integer.parseInt(option1);
        } catch (NumberFormatException e ) {
            String errorMsg = "Not number: value=" + option1;
            throw new JobParametersInvalidException(errorMsg);
        }
    }
}
