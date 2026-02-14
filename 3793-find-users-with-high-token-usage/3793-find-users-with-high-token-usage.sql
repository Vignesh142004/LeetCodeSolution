Select user_id,count(prompt) as prompt_count,round(avg(tokens),2) as avg_tokens from prompts group by user_id  having prompt_count>=3 and max(tokens)>avg_tokens order by avg_tokens desc;
