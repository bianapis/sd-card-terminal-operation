/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardTerminalOperationApiService {

	CardTerminalOperationBatchResponse executePostBatches(String crReferenceId, CardTerminalOperationBatchRequest request);
	
	CardTerminalOperationBatchResponse executePutBatches(String crReferenceId, String bqReferenceId, CardTerminalOperationBatchRequest request);
	
	CardTerminalOperationCaptureResponse executePostCapture(String crReferenceId, CardTerminalOperationCaptureRequest request);
	
	CardTerminalOperationCaptureResponse executePutCapture(String crReferenceId, String bqReferenceId, CardTerminalOperationCaptureRequest request);
	
	CardTerminalOperationRecordResponse record(String crReferenceId, CardTerminalOperationRecordRequest request);
	
	CardTerminalOperationUpdateResponse requestPostUpdates(String crReferenceId, CardTerminalOperationUpdateRequest request);
	
	CardTerminalOperationUpdateResponse requestPutUpdates(String crReferenceId, String bqReferenceId, CardTerminalOperationUpdateRequest request);
	
	CardTerminalOperationResponse retrieve(String crReferenceId);
	
	CardTerminalOperationAuthorizationResponse retrieveAuthorizations(String crReferenceId, String bqReferenceId);
	
	CardTerminalOperationBatchResponse retrieveBatches(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CardTerminalOperationCaptureResponse retrieveCapture(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CardTerminalOperationReportingResponse retrieveReporting(String crReferenceId, String bqReferenceId);
	
	CardTerminalOperationUpdateResponse retrieveUpdates(String crReferenceId, String bqReferenceId);
	
}
