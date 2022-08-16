package com.du.folli.dio.controllers;

import com.du.folli.dio.dto.InstrumentDto;
import com.du.folli.dio.provider.api.InstrumentApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InstrumentsController implements InstrumentApi {

    @Override
    public ResponseEntity<Void> addInstrument(InstrumentDto body) {
        return InstrumentApi.super.addInstrument(body);
    }

    @Override
    public ResponseEntity<Void> deleteInstrument(Long instrumentId) {
        return InstrumentApi.super.deleteInstrument(instrumentId);
    }

    @Override
    public ResponseEntity<List<InstrumentDto>> findInstrumentByStatus(List<String> status) {
        return InstrumentApi.super.findInstrumentByStatus(status);
    }

    @Override
    public ResponseEntity<InstrumentDto> getInstrumentById(Long instrumentId) {
        return InstrumentApi.super.getInstrumentById(instrumentId);
    }

    @Override
    public ResponseEntity<Void> updateInstrument(InstrumentDto body) {
        return InstrumentApi.super.updateInstrument(body);
    }
}
