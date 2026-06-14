# Lore Master - Project Guide

## Project Overview
Lore Master is a RAG (Retrieval-Augmented Generation) system designed to act as an expert on specific "lore" datasets. It allows users to upload knowledge and query it through an AI that is grounded in that specific data.

## Tech Stack
- **Backend:** Java 17, Spring Boot
- **AI Framework:** Spring AI
- **LLM:** Ollama (Local - llama 3.1)
- **Vector DB:** ChromaDB (Local via Docker)
- **IDE:** Eclipse

## Roadmap
- [x] Basic Backend Setup (Controller and Application)
- [x] **Phase 1: LLM Integration**
    - Add Spring AI dependencies
    - Configure Ollama connection in `application.properties`
    - Create `AiService` for generating responses
    - Connect `LoreController` to `AiService` for real-time chat
    - Verify connectivity with local Llama 3.1
- [ ] **Phase 2: Vector Database Setup**
    - [x] Select ChromaDB as Vector Store
    - [x] Add ChromaDB and Embedding dependencies to `pom.xml`
    - [ ] Install and start ChromaDB via Docker
    - [ ] Configure Vector Store in Spring Boot
- [ ] **Phase 3: Lore Ingestion Pipeline**
    - Document upload endpoint
    - Text splitting/chunking logic
    - Embedding and storage
- [ ] **Phase 4: Full RAG Implementation**
    - Implement similarity search
    - Context-aware prompt construction
    - Final end-to-end testing

## Current State
- Project pushed to GitHub: `https://github.com/Nitish-Padala/lore-master`
- Local AI integration is fully operational.
- Now in Phase 2: Installing Docker and starting the ChromaDB server.
- User is maintaining handwritten notes for learning concepts.

## Next Goal
Confirm ChromaDB is running via Docker and connect it to the Spring Boot backend.
