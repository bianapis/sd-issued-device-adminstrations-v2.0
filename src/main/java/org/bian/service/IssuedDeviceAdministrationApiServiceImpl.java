/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class IssuedDeviceAdministrationApiServiceImpl implements IssuedDeviceAdministrationApiService {

	public SDIssuedDeviceAdministrationActivateOutputModel activate(SDIssuedDeviceAdministrationActivateInputModel request){
		return JsonReader.read("activate-SDIssuedDeviceAdministrationActivateOutputModel.json",new TypeReference<SDIssuedDeviceAdministrationActivateOutputModel>(){});
	}
	
	public BQDeviceAssignmentCaptureOutputModel captureDeviceassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceAssignmentCaptureInputModel request){
		return JsonReader.read("capture-BQDeviceAssignmentCaptureOutputModel.json",new TypeReference<BQDeviceAssignmentCaptureOutputModel>(){});
	}
	
	public BQPasswordAssignmentCaptureOutputModel capturePasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPasswordAssignmentCaptureInputModel request){
		return JsonReader.read("capture-BQPasswordAssignmentCaptureOutputModel.json",new TypeReference<BQPasswordAssignmentCaptureOutputModel>(){});
	}
	
	public BQQuestionAssignmentCaptureOutputModel captureQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQuestionAssignmentCaptureInputModel request){
		return JsonReader.read("capture-BQQuestionAssignmentCaptureOutputModel.json",new TypeReference<BQQuestionAssignmentCaptureOutputModel>(){});
	}
	
	public BQReaderAssignmentCaptureOutputModel captureReaderassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReaderAssignmentCaptureInputModel request){
		return JsonReader.read("capture-BQReaderAssignmentCaptureOutputModel.json",new TypeReference<BQReaderAssignmentCaptureOutputModel>(){});
	}
	
	public SDIssuedDeviceAdministrationConfigureOutputModel configure(String sdReferenceId, SDIssuedDeviceAdministrationConfigureInputModel request){
		return JsonReader.read("configure-SDIssuedDeviceAdministrationConfigureOutputModel.json",new TypeReference<SDIssuedDeviceAdministrationConfigureOutputModel>(){});
	}
	
	public BQBiometricAssignmentControlOutputModel controlBiometricassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBiometricAssignmentControlInputModel request){
		return JsonReader.read("control-BQBiometricAssignmentControlOutputModel.json",new TypeReference<BQBiometricAssignmentControlOutputModel>(){});
	}
	
	public BQChequesAssignmentControlOutputModel controlChequesassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChequesAssignmentControlInputModel request){
		return JsonReader.read("control-BQChequesAssignmentControlOutputModel.json",new TypeReference<BQChequesAssignmentControlOutputModel>(){});
	}
	
	public BQDeviceAssignmentControlOutputModel controlDeviceassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceAssignmentControlInputModel request){
		return JsonReader.read("control-BQDeviceAssignmentControlOutputModel.json",new TypeReference<BQDeviceAssignmentControlOutputModel>(){});
	}
	
	public BQPasswordAssignmentControlOutputModel controlPasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPasswordAssignmentControlInputModel request){
		return JsonReader.read("control-BQPasswordAssignmentControlOutputModel.json",new TypeReference<BQPasswordAssignmentControlOutputModel>(){});
	}
	
	public BQQuestionAssignmentControlOutputModel controlQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQuestionAssignmentControlInputModel request){
		return JsonReader.read("control-BQQuestionAssignmentControlOutputModel.json",new TypeReference<BQQuestionAssignmentControlOutputModel>(){});
	}
	
	public BQReaderAssignmentControlOutputModel controlReaderassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReaderAssignmentControlInputModel request){
		return JsonReader.read("control-BQReaderAssignmentControlOutputModel.json",new TypeReference<BQReaderAssignmentControlOutputModel>(){});
	}
	
	public CRIssuedDeviceAllocationControlOutputModel control(String sdReferenceId, String crReferenceId, CRIssuedDeviceAllocationControlInputModel request){
		return JsonReader.read("control-CRIssuedDeviceAllocationControlOutputModel.json",new TypeReference<CRIssuedDeviceAllocationControlOutputModel>(){});
	}
	
	public BQBiometricAssignmentExchangeOutputModel exchangeBiometricassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBiometricAssignmentExchangeInputModel request){
		return JsonReader.read("exchange-BQBiometricAssignmentExchangeOutputModel.json",new TypeReference<BQBiometricAssignmentExchangeOutputModel>(){});
	}
	
	public BQChequesAssignmentExchangeOutputModel exchangeChequesassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQChequesAssignmentExchangeInputModel request){
		return JsonReader.read("exchange-BQChequesAssignmentExchangeOutputModel.json",new TypeReference<BQChequesAssignmentExchangeOutputModel>(){});
	}
	
	public BQPasswordAssignmentExchangeOutputModel exchangePasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPasswordAssignmentExchangeInputModel request){
		return JsonReader.read("exchange-BQPasswordAssignmentExchangeOutputModel.json",new TypeReference<BQPasswordAssignmentExchangeOutputModel>(){});
	}
	
	public BQQuestionAssignmentExchangeOutputModel exchangeQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQuestionAssignmentExchangeInputModel request){
		return JsonReader.read("exchange-BQQuestionAssignmentExchangeOutputModel.json",new TypeReference<BQQuestionAssignmentExchangeOutputModel>(){});
	}
	
	public CRIssuedDeviceAllocationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRIssuedDeviceAllocationExchangeInputModel request){
		return JsonReader.read("exchange-CRIssuedDeviceAllocationExchangeOutputModel.json",new TypeReference<CRIssuedDeviceAllocationExchangeOutputModel>(){});
	}
	
	public SDIssuedDeviceAdministrationFeedbackOutputModel feedback(String sdReferenceId, SDIssuedDeviceAdministrationFeedbackInputModel request){
		return JsonReader.read("feedback-SDIssuedDeviceAdministrationFeedbackOutputModel.json",new TypeReference<SDIssuedDeviceAdministrationFeedbackOutputModel>(){});
	}
	
	public CRIssuedDeviceAllocationProvideOutputModel provide(String sdReferenceId, CRIssuedDeviceAllocationProvideInputModel request){
		return JsonReader.read("provide-CRIssuedDeviceAllocationProvideOutputModel.json",new TypeReference<CRIssuedDeviceAllocationProvideOutputModel>(){});
	}
	
	public BQBiometricAssignmentProvideOutputModel provideBiometricassignment(String sdReferenceId, String crReferenceId, BQBiometricAssignmentProvideInputModel request){
		return JsonReader.read("provide-BQBiometricAssignmentProvideOutputModel.json",new TypeReference<BQBiometricAssignmentProvideOutputModel>(){});
	}
	
	public BQChequesAssignmentProvideOutputModel provideChequesassignment(String sdReferenceId, String crReferenceId, BQChequesAssignmentProvideInputModel request){
		return JsonReader.read("provide-BQChequesAssignmentProvideOutputModel.json",new TypeReference<BQChequesAssignmentProvideOutputModel>(){});
	}
	
	public BQPasswordAssignmentProvideOutputModel providePasswordassignment(String sdReferenceId, String crReferenceId, BQPasswordAssignmentProvideInputModel request){
		return JsonReader.read("provide-BQPasswordAssignmentProvideOutputModel.json",new TypeReference<BQPasswordAssignmentProvideOutputModel>(){});
	}
	
	public BQQuestionAssignmentProvideOutputModel provideQuestionassignment(String sdReferenceId, String crReferenceId, BQQuestionAssignmentProvideInputModel request){
		return JsonReader.read("provide-BQQuestionAssignmentProvideOutputModel.json",new TypeReference<BQQuestionAssignmentProvideOutputModel>(){});
	}
	
	public CRIssuedDeviceAllocationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRIssuedDeviceAllocationRetrieveOutputModel.json",new TypeReference<CRIssuedDeviceAllocationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQBiometricAssignmentRetrieveOutputModel retrieveBiometricassignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQBiometricAssignmentRetrieveOutputModel.json",new TypeReference<BQBiometricAssignmentRetrieveOutputModel>(){});
	}
	
	public BQChequesAssignmentRetrieveOutputModel retrieveChequesassignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQChequesAssignmentRetrieveOutputModel.json",new TypeReference<BQChequesAssignmentRetrieveOutputModel>(){});
	}
	
	public BQDeviceAssignmentRetrieveOutputModel retrieveDeviceassignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDeviceAssignmentRetrieveOutputModel.json",new TypeReference<BQDeviceAssignmentRetrieveOutputModel>(){});
	}
	
	public BQPasswordAssignmentRetrieveOutputModel retrievePasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPasswordAssignmentRetrieveOutputModel.json",new TypeReference<BQPasswordAssignmentRetrieveOutputModel>(){});
	}
	
	public BQQuestionAssignmentRetrieveOutputModel retrieveQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQQuestionAssignmentRetrieveOutputModel.json",new TypeReference<BQQuestionAssignmentRetrieveOutputModel>(){});
	}
	
	public BQReaderAssignmentRetrieveOutputModel retrieveReaderassignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReaderAssignmentRetrieveOutputModel.json",new TypeReference<BQReaderAssignmentRetrieveOutputModel>(){});
	}
	
	public SDIssuedDeviceAdministrationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDIssuedDeviceAdministrationRetrieveOutputModel.json",new TypeReference<SDIssuedDeviceAdministrationRetrieveOutputModel>(){});
	}
	
	public CRIssuedDeviceAllocationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRIssuedDeviceAllocationUpdateInputModel request){
		return JsonReader.read("update-CRIssuedDeviceAllocationUpdateOutputModel.json",new TypeReference<CRIssuedDeviceAllocationUpdateOutputModel>(){});
	}
	
	public BQBiometricAssignmentUpdateOutputModel updateBiometricassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQBiometricAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQBiometricAssignmentUpdateOutputModel.json",new TypeReference<BQBiometricAssignmentUpdateOutputModel>(){});
	}
	
	public BQDeviceAssignmentUpdateOutputModel updateDeviceassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQDeviceAssignmentUpdateOutputModel.json",new TypeReference<BQDeviceAssignmentUpdateOutputModel>(){});
	}
	
	public BQPasswordAssignmentUpdateOutputModel updatePasswordassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPasswordAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQPasswordAssignmentUpdateOutputModel.json",new TypeReference<BQPasswordAssignmentUpdateOutputModel>(){});
	}
	
	public BQQuestionAssignmentUpdateOutputModel updateQuestionassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQuestionAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQQuestionAssignmentUpdateOutputModel.json",new TypeReference<BQQuestionAssignmentUpdateOutputModel>(){});
	}
	
	public BQReaderAssignmentUpdateOutputModel updateReaderassignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReaderAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQReaderAssignmentUpdateOutputModel.json",new TypeReference<BQReaderAssignmentUpdateOutputModel>(){});
	}
	
}
