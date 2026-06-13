# Lore Master - Project Guide

## Project Overview
Lore Master is a RAG (Retrieval-Augmented Generation) system designed to act as an expert on specific "lore" datasets. It allows users to upload knowledge and query it through an AI that is grounded in that specific data.

## Tech Stack
- **Backend:** Java 17, Spring Boot
- **AI Framework:** Spring AI
- **LLM:** Ollama (Local)
- **Vector DB:** TBD (Planned: ChromaDB or PGVector)

## Roadmap
- [x] Basic Backend Setup (Controller and Application)
- [ ] **Phase 1: LLM Integration**
    - Add Spring AI dependencies
    - Configure Ollama connection
    - Create AI Service for generating responses
- [ ] **Phase 2: Vector Database Setup**
    - Select and integrate Vector DB
    - Configure embeddings model
- [ ] **Phase 3: Lore Ingestion Pipeline**
    - Document upload endpoint
    - Text splitting/chunking logic
    - Embedding and storage
- [ ] **Phase 4: Full RAG Implementation**
    - Implement similarity search
    - Context-aware prompt construction
    - Final end-to-end testing

## Current Goal
Complete Phase 1: Implement a working chat endpoint that talks to a local Ollama model.
