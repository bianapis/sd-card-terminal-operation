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
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class CardTerminalOperationApiController {

	@Autowired
	CardTerminalOperationApiService service;
	
	@BQ("batches")
	@Operate.ExecutePost
	public BianResponse<CardTerminalOperationBatchResponse> executePostBatches(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTerminalOperationBatchRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostBatches(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("batches")
	@Operate.ExecutePut
	public BianResponse<CardTerminalOperationBatchResponse> executePutBatches(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardTerminalOperationBatchRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutBatches(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Operate.ExecutePost
	public BianResponse<CardTerminalOperationCaptureResponse> executePostCapture(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTerminalOperationCaptureRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePostCapture(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("capture")
	@Operate.ExecutePut
	public BianResponse<CardTerminalOperationCaptureResponse> executePutCapture(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardTerminalOperationCaptureRequest> bianRequest) {
		return BianResponse.forSuccess(service.executePutCapture(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Record
	public BianResponse<CardTerminalOperationRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTerminalOperationRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("updates")
	@Operate.RequestPost
	public BianResponse<CardTerminalOperationUpdateResponse> requestPostUpdates(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTerminalOperationUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPostUpdates(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("updates")
	@Operate.RequestPut
	public BianResponse<CardTerminalOperationUpdateResponse> requestPutUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardTerminalOperationUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPutUpdates(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<CardTerminalOperationResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("authorizations")
	@Operate.Retrieve
	public BianResponse<CardTerminalOperationAuthorizationResponse> retrieveAuthorizations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthorizations(crReferenceId, bqReferenceId));
	}
	
	@BQ("batches")
	@Operate.Retrieve
	public BianResponse<CardTerminalOperationBatchResponse> retrieveBatches(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBatches(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("capture")
	@Operate.Retrieve
	public BianResponse<CardTerminalOperationCaptureResponse> retrieveCapture(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCapture(crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("reporting")
	@Operate.Retrieve
	public BianResponse<CardTerminalOperationReportingResponse> retrieveReporting(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReporting(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Operate.Retrieve
	public BianResponse<CardTerminalOperationUpdateResponse> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
}
