package com.lendingApp.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lendingApp.main.dto.LoanResponseDto;
import com.lendingApp.main.dto.LoanSchemeDto;
import com.lendingApp.main.entity.LoanScheme;
import com.lendingApp.main.exception.LoanException;
import com.lendingApp.main.repository.LoanSchemeRepository;

@Service
public class LoanSchemeServiceImpl implements LoanSchemeService{

    @Autowired
    private LoanSchemeRepository loanSchemeRepository;
    @Autowired
    ModelMapper mapper;
    @Override
    public LoanResponseDto findLoandById(Long id) {
        LoanScheme loan = loanSchemeRepository.findById(id)
        .orElseThrow(() -> new LoanException("No loan with id " + id));
        return mapper.map(loan,LoanResponseDto.class);
    }
    @Override
    public LoanResponseDto addLoanScheme(LoanSchemeDto loanSchemeDto) {
        
       LoanScheme loanScheme = mapper.map(loanSchemeDto, LoanScheme.class);
       loanScheme.setActive(true);
       loanScheme = loanSchemeRepository.save(loanScheme);
       return mapper.map(loanScheme,LoanResponseDto.class);
    }
    @Override
    public List<LoanResponseDto> getAllLoans() {
       List<LoanScheme> loanSchemes = loanSchemeRepository.findAll();
       List<LoanResponseDto> loanResponseDtos = new ArrayList<>();
       for(LoanScheme loanScheme:loanSchemes){
        if(loanScheme.isActive()) loanResponseDtos.add(mapper.map(loanScheme, LoanResponseDto.class));
       }
       return loanResponseDtos;
    }
    @Override
    public List<LoanResponseDto> findLoanByLoanType(String loanType) {
        List<LoanScheme> loanSchemes = loanSchemeRepository.findByLoanType(loanType);
       List<LoanResponseDto> loanResponseDtos = new ArrayList<>();
       for(LoanScheme loanScheme:loanSchemes){
        loanResponseDtos.add(mapper.map(loanScheme, LoanResponseDto.class));
       }
       return loanResponseDtos;
    }
    @Override
    public LoanResponseDto deactiveLoanScheme(Long loanId) {
        LoanScheme loan = loanSchemeRepository.findById(loanId)
        .orElseThrow(() -> new LoanException("No loan with id " + loanId));
        loan.setActive(false);
        loan = loanSchemeRepository.save(loan);
        return mapper.map(loan, LoanResponseDto.class);
    }
    @Override
    public LoanResponseDto activateLoanScheme(Long loanId) {
       LoanScheme loan = loanSchemeRepository.findById(loanId)
        .orElseThrow(() -> new LoanException("No loan with id " + loanId));
        loan.setActive(true);
        loan = loanSchemeRepository.save(loan);
        return mapper.map(loan, LoanResponseDto.class);
    }
}