/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface IssuedDeviceAdministrationApiService {

	SDIssuedDeviceAdministrationActivateOutputModel activate(SDIssuedDeviceAdministrationActivateInputModel request);
	
	BQDeviceAssignmentCaptureOutputModel captureDeviceassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceAssignmentCaptureInputModel request);
	
	BQPasswordAssignmentCaptureOutputModel capturePasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPasswordAssignmentCaptureInputModel request);
	
	BQQuestionAssignmentCaptureOutputModel captureQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQuestionAssignmentCaptureInputModel request);
	
	BQReaderAssignmentCaptureOutputModel captureReaderassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReaderAssignmentCaptureInputModel request);
	
	SDIssuedDeviceAdministrationConfigureOutputModel configure(String sdReferenceId, SDIssuedDeviceAdministrationConfigureInputModel request);
	
	BQBiometricAssignmentControlOutputModel controlBiometricassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBiometricAssignmentControlInputModel request);
	
	BQChequesAssignmentControlOutputModel controlChequesassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChequesAssignmentControlInputModel request);
	
	BQDeviceAssignmentControlOutputModel controlDeviceassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceAssignmentControlInputModel request);
	
	BQPasswordAssignmentControlOutputModel controlPasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPasswordAssignmentControlInputModel request);
	
	BQQuestionAssignmentControlOutputModel controlQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQuestionAssignmentControlInputModel request);
	
	BQReaderAssignmentControlOutputModel controlReaderassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReaderAssignmentControlInputModel request);
	
	CRIssuedDeviceAllocationControlOutputModel control(String sdReferenceId, String crReferenceId, CRIssuedDeviceAllocationControlInputModel request);
	
	BQBiometricAssignmentExchangeOutputModel exchangeBiometricassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBiometricAssignmentExchangeInputModel request);
	
	BQChequesAssignmentExchangeOutputModel exchangeChequesassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChequesAssignmentExchangeInputModel request);
	
	BQPasswordAssignmentExchangeOutputModel exchangePasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPasswordAssignmentExchangeInputModel request);
	
	BQQuestionAssignmentExchangeOutputModel exchangeQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQuestionAssignmentExchangeInputModel request);
	
	CRIssuedDeviceAllocationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRIssuedDeviceAllocationExchangeInputModel request);
	
	SDIssuedDeviceAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDIssuedDeviceAdministrationFeedbackInputModel request);
	
	CRIssuedDeviceAllocationProvideOutputModel provide(String sdReferenceId, CRIssuedDeviceAllocationProvideInputModel request);
	
	BQBiometricAssignmentProvideOutputModel provideBiometricassignment(String sdReferenceId, String crReferenceId, BQBiometricAssignmentProvideInputModel request);
	
	BQChequesAssignmentProvideOutputModel provideChequesassignment(String sdReferenceId, String crReferenceId, BQChequesAssignmentProvideInputModel request);
	
	BQPasswordAssignmentProvideOutputModel providePasswordassignment(String sdReferenceId, String crReferenceId, BQPasswordAssignmentProvideInputModel request);
	
	BQQuestionAssignmentProvideOutputModel provideQuestionassignment(String sdReferenceId, String crReferenceId, BQQuestionAssignmentProvideInputModel request);
	
	CRIssuedDeviceAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQBiometricAssignmentRetrieveOutputModel retrieveBiometricassignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQChequesAssignmentRetrieveOutputModel retrieveChequesassignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDeviceAssignmentRetrieveOutputModel retrieveDeviceassignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPasswordAssignmentRetrieveOutputModel retrievePasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQQuestionAssignmentRetrieveOutputModel retrieveQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReaderAssignmentRetrieveOutputModel retrieveReaderassignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDIssuedDeviceAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRIssuedDeviceAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRIssuedDeviceAllocationUpdateInputModel request);
	
	BQBiometricAssignmentUpdateOutputModel updateBiometricassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBiometricAssignmentUpdateInputModel request);
	
	BQDeviceAssignmentUpdateOutputModel updateDeviceassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceAssignmentUpdateInputModel request);
	
	BQPasswordAssignmentUpdateOutputModel updatePasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPasswordAssignmentUpdateInputModel request);
	
	BQQuestionAssignmentUpdateOutputModel updateQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQuestionAssignmentUpdateInputModel request);
	
	BQReaderAssignmentUpdateOutputModel updateReaderassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReaderAssignmentUpdateInputModel request);
	
}
