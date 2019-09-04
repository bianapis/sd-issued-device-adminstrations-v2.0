/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Allocate;

@BianRestController
public class IssuedDeviceAdministrationApiController {

	@Autowired
	IssuedDeviceAdministrationApiService service;
	
	@Allocate.Activate
	public BianResponse<SDIssuedDeviceAdministrationActivateOutputModel> activate(@RequestBody BianRequest<SDIssuedDeviceAdministrationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("deviceassignment")
	@Allocate.Capture
	public BianResponse<BQDeviceAssignmentCaptureOutputModel> captureDeviceassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDeviceAssignmentCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureDeviceassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("passwordassignment")
	@Allocate.Capture
	public BianResponse<BQPasswordAssignmentCaptureOutputModel> capturePasswordassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPasswordAssignmentCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capturePasswordassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("questionassignment")
	@Allocate.Capture
	public BianResponse<BQQuestionAssignmentCaptureOutputModel> captureQuestionassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQQuestionAssignmentCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureQuestionassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("readerassignment")
	@Allocate.Capture
	public BianResponse<BQReaderAssignmentCaptureOutputModel> captureReaderassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReaderAssignmentCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureReaderassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Configure
	public BianResponse<SDIssuedDeviceAdministrationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDIssuedDeviceAdministrationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("biometricassignment")
	@Allocate.Control
	public BianResponse<BQBiometricAssignmentControlOutputModel> controlBiometricassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBiometricAssignmentControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlBiometricassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("chequesassignment")
	@Allocate.Control
	public BianResponse<BQChequesAssignmentControlOutputModel> controlChequesassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQChequesAssignmentControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlChequesassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("deviceassignment")
	@Allocate.Control
	public BianResponse<BQDeviceAssignmentControlOutputModel> controlDeviceassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDeviceAssignmentControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlDeviceassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("passwordassignment")
	@Allocate.Control
	public BianResponse<BQPasswordAssignmentControlOutputModel> controlPasswordassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPasswordAssignmentControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlPasswordassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("questionassignment")
	@Allocate.Control
	public BianResponse<BQQuestionAssignmentControlOutputModel> controlQuestionassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQQuestionAssignmentControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlQuestionassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("readerassignment")
	@Allocate.Control
	public BianResponse<BQReaderAssignmentControlOutputModel> controlReaderassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReaderAssignmentControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlReaderassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Control
	public BianResponse<CRIssuedDeviceAllocationControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIssuedDeviceAllocationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("biometricassignment")
	@Allocate.Exchange
	public BianResponse<BQBiometricAssignmentExchangeOutputModel> exchangeBiometricassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBiometricAssignmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeBiometricassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("chequesassignment")
	@Allocate.Exchange
	public BianResponse<BQChequesAssignmentExchangeOutputModel> exchangeChequesassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQChequesAssignmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeChequesassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("passwordassignment")
	@Allocate.Exchange
	public BianResponse<BQPasswordAssignmentExchangeOutputModel> exchangePasswordassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPasswordAssignmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePasswordassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("questionassignment")
	@Allocate.Exchange
	public BianResponse<BQQuestionAssignmentExchangeOutputModel> exchangeQuestionassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQQuestionAssignmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeQuestionassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Exchange
	public BianResponse<CRIssuedDeviceAllocationExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIssuedDeviceAllocationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Feedback
	public BianResponse<SDIssuedDeviceAdministrationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDIssuedDeviceAdministrationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Provide
	public BianResponse<CRIssuedDeviceAllocationProvideOutputModel> provide(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRIssuedDeviceAllocationProvideInputModel> bianRequest) {
		return BianResponse.forSuccess(service.provide(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("biometricassignment")
	@Allocate.Provide
	public BianResponse<BQBiometricAssignmentProvideOutputModel> provideBiometricassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQBiometricAssignmentProvideInputModel> bianRequest) {
		return BianResponse.forSuccess(service.provideBiometricassignment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("chequesassignment")
	@Allocate.Provide
	public BianResponse<BQChequesAssignmentProvideOutputModel> provideChequesassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQChequesAssignmentProvideInputModel> bianRequest) {
		return BianResponse.forSuccess(service.provideChequesassignment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("passwordassignment")
	@Allocate.Provide
	public BianResponse<BQPasswordAssignmentProvideOutputModel> providePasswordassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPasswordAssignmentProvideInputModel> bianRequest) {
		return BianResponse.forSuccess(service.providePasswordassignment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("questionassignment")
	@Allocate.Provide
	public BianResponse<BQQuestionAssignmentProvideOutputModel> provideQuestionassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQQuestionAssignmentProvideInputModel> bianRequest) {
		return BianResponse.forSuccess(service.provideQuestionassignment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.Retrieve
	public BianResponse<CRIssuedDeviceAllocationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Allocate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Allocate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Allocate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("biometricassignment")
	@Allocate.Retrieve
	public BianResponse<BQBiometricAssignmentRetrieveOutputModel> retrieveBiometricassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBiometricassignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("chequesassignment")
	@Allocate.Retrieve
	public BianResponse<BQChequesAssignmentRetrieveOutputModel> retrieveChequesassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveChequesassignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("deviceassignment")
	@Allocate.Retrieve
	public BianResponse<BQDeviceAssignmentRetrieveOutputModel> retrieveDeviceassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeviceassignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("passwordassignment")
	@Allocate.Retrieve
	public BianResponse<BQPasswordAssignmentRetrieveOutputModel> retrievePasswordassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePasswordassignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("questionassignment")
	@Allocate.Retrieve
	public BianResponse<BQQuestionAssignmentRetrieveOutputModel> retrieveQuestionassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveQuestionassignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("readerassignment")
	@Allocate.Retrieve
	public BianResponse<BQReaderAssignmentRetrieveOutputModel> retrieveReaderassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReaderassignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Allocate.RetrieveSD
	public BianResponse<SDIssuedDeviceAdministrationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Allocate.Update
	public BianResponse<CRIssuedDeviceAllocationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIssuedDeviceAllocationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("biometricassignment")
	@Allocate.Update
	public BianResponse<BQBiometricAssignmentUpdateOutputModel> updateBiometricassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQBiometricAssignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateBiometricassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("deviceassignment")
	@Allocate.Update
	public BianResponse<BQDeviceAssignmentUpdateOutputModel> updateDeviceassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDeviceAssignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDeviceassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("passwordassignment")
	@Allocate.Update
	public BianResponse<BQPasswordAssignmentUpdateOutputModel> updatePasswordassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPasswordAssignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePasswordassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("questionassignment")
	@Allocate.Update
	public BianResponse<BQQuestionAssignmentUpdateOutputModel> updateQuestionassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQQuestionAssignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateQuestionassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("readerassignment")
	@Allocate.Update
	public BianResponse<BQReaderAssignmentUpdateOutputModel> updateReaderassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReaderAssignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateReaderassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
