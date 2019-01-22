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
public class CardTerminalOperationApiServiceImpl implements CardTerminalOperationApiService {

	public CardTerminalOperationBatchResponse executePostBatches(String crReferenceId, CardTerminalOperationBatchRequest request){
		return JsonReader.read("executePost-CardTerminalOperationBatchResponse.json",new TypeReference<CardTerminalOperationBatchResponse>(){});
	}
	
	public CardTerminalOperationBatchResponse executePutBatches(String crReferenceId, String bqReferenceId, CardTerminalOperationBatchRequest request){
		return JsonReader.read("executePut-CardTerminalOperationBatchResponse.json",new TypeReference<CardTerminalOperationBatchResponse>(){});
	}
	
	public CardTerminalOperationCaptureResponse executePostCapture(String crReferenceId, CardTerminalOperationCaptureRequest request){
		return JsonReader.read("executePost-CardTerminalOperationCaptureResponse.json",new TypeReference<CardTerminalOperationCaptureResponse>(){});
	}
	
	public CardTerminalOperationCaptureResponse executePutCapture(String crReferenceId, String bqReferenceId, CardTerminalOperationCaptureRequest request){
		return JsonReader.read("executePut-CardTerminalOperationCaptureResponse.json",new TypeReference<CardTerminalOperationCaptureResponse>(){});
	}
	
	public CardTerminalOperationRecordResponse record(String crReferenceId, CardTerminalOperationRecordRequest request){
		return JsonReader.read("record-CardTerminalOperationRecordResponse.json",new TypeReference<CardTerminalOperationRecordResponse>(){});
	}
	
	public CardTerminalOperationUpdateResponse requestPostUpdates(String crReferenceId, CardTerminalOperationUpdateRequest request){
		return JsonReader.read("requestPost-CardTerminalOperationUpdateResponse.json",new TypeReference<CardTerminalOperationUpdateResponse>(){});
	}
	
	public CardTerminalOperationUpdateResponse requestPutUpdates(String crReferenceId, String bqReferenceId, CardTerminalOperationUpdateRequest request){
		return JsonReader.read("requestPut-CardTerminalOperationUpdateResponse.json",new TypeReference<CardTerminalOperationUpdateResponse>(){});
	}
	
	public CardTerminalOperationResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CardTerminalOperationResponse.json",new TypeReference<CardTerminalOperationResponse>(){});
	}
	
	public CardTerminalOperationAuthorizationResponse retrieveAuthorizations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTerminalOperationAuthorizationResponse.json",new TypeReference<CardTerminalOperationAuthorizationResponse>(){});
	}
	
	public CardTerminalOperationBatchResponse retrieveBatches(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTerminalOperationBatchResponse.json",new TypeReference<CardTerminalOperationBatchResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardTerminalOperationCaptureResponse retrieveCapture(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTerminalOperationCaptureResponse.json",new TypeReference<CardTerminalOperationCaptureResponse>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardTerminalOperationReportingResponse retrieveReporting(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTerminalOperationReportingResponse.json",new TypeReference<CardTerminalOperationReportingResponse>(){});
	}
	
	public CardTerminalOperationUpdateResponse retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTerminalOperationUpdateResponse.json",new TypeReference<CardTerminalOperationUpdateResponse>(){});
	}
	
}
